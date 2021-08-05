# Plain PHP Script

[![php.plainphp](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/php.plainphp.yaml/badge.svg)](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/php.plainphp.yaml)

*A sample Dockerfile that builds a simple container executing a PHP script*

## Docker Run

```bash
docker build -t plainphp .
docker run --name plainphp -d plainphp
```