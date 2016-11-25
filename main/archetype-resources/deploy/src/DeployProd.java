import javax.enterprise.inject.Alternative;

@Alternative
class DeployProd implements Deploy {
    public void run() {
    }
}