class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    List<List<Integer>> graph = new ArrayList<List<Integer>>();
        // initialize graph with source in edges as index of element in list, element as empty list
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        // form adjacency list, e.g for 1 -> 2, add 2 -> 1 too as graph has bidirectional edges
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        Set<Integer> visited = new HashSet<Integer>();
        Stack<Integer> st = new Stack<>();
        st.push(source);
        while(!st.isEmpty()){
            int vertex = st.pop();
            if(vertex ==  destination){
                return true;
            }
            // if node has not been visited, visit and add all adjacent nodes to the stack
            if(!visited.contains(vertex)){
                visited.add(vertex);
                for(int verDest : graph.get(vertex)){
                    st.push(verDest);
                }
            }
        }
        return false;
    }
}