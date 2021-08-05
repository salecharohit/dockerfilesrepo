# Python Django

[![python.django](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/python.django.yaml/badge.svg)](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/python.django.yaml)

*A sample Dockerfile that builds a Django Application in Python*

## Docker Run

```bash
docker build -t pythondjango .
docker run --name pythondjango -d -p 5000:5000 pythondjango
```

## References:

- https://djangocentral.com/create-a-hello-world-django-application/
- https://codefresh.io/docs/docs/learn-by-example/python/django/