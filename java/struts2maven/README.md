# Struts2 with Maven

[![java.struts2maven](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/java.struts2maven.yaml/badge.svg)](https://github.com/salecharohit/dockerfilesrepo/actions/workflows/java.struts2maven.yaml)

*A sample Dockerfile that builds a Struts2 Web application with Maven as the build engine*

## Docker Run

```bash
docker build -t struts2maven .
docker run --name struts2maven -d -p 8080:8090 struts2maven
```

## Kubernetes Deployment

```bash
kubectl apply -f kubernetes.yaml
kubectl exec -it $(kubectl get pods -l app=struts2maven -o jsonpath={..metadata.name}) -- /bin/sh
```

## References:

- https://www.javatips.net/blog/struts-2-annotation-example