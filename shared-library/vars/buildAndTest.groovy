def call(String appname) {
    echo "=== Shared Library: buildAndtest called for ${appName} ==="

    stage('Build') {
        echo "building ${appName}..."
        sh 'echo "Simulated build step"'
    }

    stage('Test') {
        echo "Testinf ${appName}..."
        sh 'echo "Simulated test step"'
    }
}