import java.util.List;

public class VRPSolution {
    private List<List<Integer>> routes;
    int totalCost;

    public VRPSolution(List<List<Integer>> routes) {
        this.routes = routes;
    }

    public List<List<Integer>> getRoutes() {
        return routes;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
