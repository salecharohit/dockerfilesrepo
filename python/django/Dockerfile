FROM python:alpine3.14
RUN addgroup python && adduser -D -h /home/python -s /bin/ash python -G python
USER python
COPY app /home/python/app
WORKDIR /home/python/app
RUN pip install -r requirements.txt
EXPOSE 8000
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]