class Solution {
    // A graph is considered a tree if it is connected and the number of edges = n-1 nodes
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList <>();
        
		//create graph
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
		//since this is an undirected graph, make each edge go both ways
        for (int[] edge : edges) {
            graph.get(edge[1]).add(edge[0]);
            graph.get(edge[0]).add(edge[1]);
        }
                
        HashSet<Integer> visited = new HashSet<>();
        
		//if graph is connected then we would be able to start from any node and reach all the other nodes using dfs
        //we can dfs starting from first node since this is guaranteed to exist according to constraints
        dfs(visited, 0, graph);
        
        //if we see an unvisited node, 
        //the graph is not connected and therefore cannot be a tree
        for (int i = 0; i < n; i++) {
            if(!visited.contains(i)) return false;
        }
        
        //also check number of edges = n-1 nodes
        return (edges.length == n-1);
    }
    
     public void dfs(HashSet<Integer> visited, int currNode, List<List<Integer>> graph) {
        visited.add(currNode);
        for (Integer node : graph.get(currNode)) {
            if(!visited.contains(node)) {
                dfs(visited, node, graph);
            }
        }
    }
}