FROM postgres:latest

RUN localedef -i ko_KR -c -f UTF-8 -A /usr/share/locale/locale.alias ko_KR.UTF-8

ENV LANG ko_KR.utf8
ENV POSTGRES_USER root
ENV POSTGRES_PASSWORD qwer1234
ENV POSTGRES_DB cleanwater

COPY init.sql /docker-entrypoint-initdb.d/
RUN chmod +x /docker-entrypoint-initdb.d/init.sql

EXPOSE 5432

HEALTHCHECK --interval=10s CMD pg_isready -h localhost -p 5432 -q -U postgres