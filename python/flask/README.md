# Python Flask

[![python.flask](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/python.flask.yaml/badge.svg)](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/python.flask.yaml)

*A sample Dockerfile that builds a Flask application in Python*

## Docker Run

```bash
docker build -t pythonflask .
docker run --name pythonflask -d -p 5000:5000 pythonflask
```

## References:

- https://www.wintellect.com/containerize-python-app-5-minutes/