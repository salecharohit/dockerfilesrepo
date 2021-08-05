FROM python:alpine3.14
RUN addgroup python && adduser -D -h /home/python -s /bin/ash python -G python
USER python
COPY hello.py /home/python/hello.py
WORKDIR /home/python
CMD python hello.py