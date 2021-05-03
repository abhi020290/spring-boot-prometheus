
# Prometheus YML file

      - targets: [ '<YourMachineIP>:8080' ] # Give the P address of your machine

# Build prometheus docker image
    docker build -t prometheus .
# Run prometheus docker image using custom prometheus docker file
    docker run -d -p 9090:9090 prometheus --config.file=/prometheus/prometheus.yml
# Start Grafana docker image
    docker run -d -p 3000:3000 grafana

# Grafana Datasource
    http://<machine Ip>:9090
#Prometheus URL
http://localhost:9090

#Grafana:
http://localhost:3000/

