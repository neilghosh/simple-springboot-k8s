## Build
```
docker build . -t neilghosh/super-simple-svc:v1
```
## Run
```
docker run -p 8080:8080  -t neilghosh/super-simple-svc:v1
```
## Deploy 
```
docker push neilghosh/super-simple-svc:v1

kubectl create deployment super-simple-deployment --image=neilghosh/super-simple-svc:v1

kubectl expose deployment super-simple-deployment --type=NodePort --port 80 --target-port 8080

kubectl scale deployment super-simple-deployment --replicas=3

minikube service super-simple-deployment --url

kubectl set image deployment/super-simple-deployment super-simple-svc=neilghosh/super-simple-servicev2
```

## Deploy via Manifest 

```
kubectl apply -f k8s-manifest.yaml
kubectl delete -f k8s-manifest.yaml
```
