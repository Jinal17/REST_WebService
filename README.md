# SWE 645 : Component based Software development

### Name : Angeela Acharya, Jinalben Shah, Kripa Pokheral, Sujana Khakural

### Homework 3:
### WebApp Home page: [here](http://swe645-jinal.s3-website-us-east-1.amazonaws.com/)
### WebApp Survey page: [here](http://a93a1d16bb4504a03ada735ff2bc4813-400275033.us-east-1.elb.amazonaws.com:53812)

#### DOCKER
Dockerfile contains : Dependencies & Web application related docker definitions
DockerHub: [here](https://hub.docker.com/repository/docker/jinal0217/hw3_backend)

#### KUBERNETES
Deployment & Service Files Contains: container, kubernetes related deployment and execution definitions

**Cluster Name**: swe645hw2

#### Rancher: URL: [here](https://ec2-18-204-37-62.compute-1.amazonaws.com/login)

#### Jenkins:URL: [here](http://18.204.37.62:8080/job/swe645-webservice/)

#### Git: URL : [here](https://github.com/Jinal17/swe645_webservice)


## Steps for Triggering the Build through Jenkins:

- **First Time User** Clone this Repo using: git clone https://github.com/Jinal17/swe645_webservice
- Make necessary changes in java files for the Web service on your local system
- Modify the **DOCKER_TAG** version in Jenkinsfile. For example: Modify the **DOCKER_TAG** = ‘V8’ : to V9 (any version)
- $git status
- $git add -–all
- $git commit -m "Pushing Final Changes"
- $git push
- Once the above steps are executed successfully, the Jenkins build will get triggered and the web application with the new changes will get deployed on kubernetes cluster.
- Verify the changes on URL: [here](http://a6b85c10de9f54b0dac932cf5a2a7f29-796556045.us-east-1.elb.amazonaws.com:9191/students)