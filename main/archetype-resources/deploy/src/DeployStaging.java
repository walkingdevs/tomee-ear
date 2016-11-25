import javax.enterprise.inject.Alternative;

@Alternative
class DeployStaging implements Deploy {
    public void run() {
    }
}