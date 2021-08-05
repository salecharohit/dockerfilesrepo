# Plain Python Script

[![python.plainpy](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/python.plainpy.yaml/badge.svg)](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/python.plainpy.yaml)

*A sample Dockerfile that builds a simple container executing a python script*

## Docker Run

```bash
docker build -t plainpy .
docker run --name plainpy -d plainpy
```

## References:

- https://dockerlabs.collabnix.com/beginners/dockerfile/lab_dockerfile_python.html