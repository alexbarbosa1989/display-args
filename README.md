## main branch -> no s2i run file
## custom-run branch -> contains s2i run file

### Performed tests in OCP:

### deploy without custom run file
~~~
oc new-project display-args
oc new-app --name=display-args registry.redhat.io/ubi8/openjdk-8:latest~https://github.com/alexbarbosa1989/display-args.git
oc set env deployment/display-args JAVA_ARGS="execution.id=1755721200139293684MYR6S8XTNBYM4 process.date(date)=2025-08-20 15:24:02 -0500"
~~~
### deploy with custom run file
~~~
oc new-project display-args-custom
oc new-app --name=display-args registry.redhat.io/ubi8/openjdk-8:latest~https://github.com/alexbarbosa1989/display-args.git#custom-run
oc set env deployment/display-args JAVA_ARGS="execution.id=1755721200139293684MYR6S8XTNBYM4 process.date(date)=2025-08-20 15:24:02 -0500"
~~~
