FROM php:alpine3.14
RUN addgroup php && adduser -D -h /home/php -s /bin/ash php -G php
USER php
COPY hello.php /home/php/hello.php
WORKDIR /home/php
CMD php hello.php