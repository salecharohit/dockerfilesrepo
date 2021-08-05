# Spring Boot with Maven

[![java.springbootmaven](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/java.springbootmaven.yaml/badge.svg)](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/java.springbootmaven.yaml)

*A sample Dockerfile that builds a SpringBoot application with Maven as the build engine*

## Docker Run

```bash
docker build -t springbootmaven .
docker run --name springbootmaven -d -p 8080:8080 springbootmaven
```

## Kubernetes Deployment

```bash
kubectl apply -f kubernetes.yaml
kubectl exec -it $(kubectl get pods -l app=springbootmaven -o jsonpath={..metadata.name}) -- /bin/sh
```
