import javax.enterprise.inject.Alternative;

@Alternative
class DeployDev implements Deploy {
    public void run() {
    }
}