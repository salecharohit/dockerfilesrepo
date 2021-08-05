# Spring Boot with Gradle

[![java.springbootgradle](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/java.springbootgradle.yaml/badge.svg)](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/java.springbootgradle.yaml)

*A sample Dockerfile that builds a SpringBoot application with Gradle as the build engine*

## Docker Run

```bash
docker build -t springbootgradle .
docker run --name springbootgradle -d -p 8080:8080 springbootgradle
```

## Kubernetes Deployment

```bash
kubectl apply -f kubernetes.yaml
kubectl exec -it $(kubectl get pods -l app=springbootgradle -o jsonpath={..metadata.name}) -- /bin/sh
```

## References:

- https://github.com/codefresh-contrib/gradle-sample-app
- https://stackoverflow.com/a/61131308/1679541