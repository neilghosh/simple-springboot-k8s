## Build

docker build . -t neilghosh/hello-spring

## Run

docker run -p 8080:8080  -t neilghosh/hello-spring

## Deploy 
```
kubectl create deployment hello-spring --image=neilghosh/hello-spring

kubectl expose deployment hello-spring --type=NodePort --port 80 --target-port 8080

kubectl scale deployment hello-spring --replicas=3

minikube service hello-spring --url

kubectl set image deployment/hello-spring hello-spring=neilghosh/hello-spring
```

## Deploy via Manifest 

```
kubectl apply -f k8s-manifest.yaml
kubectl delete -f k8s-manifest.yaml
```
