class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        Queue <List<Integer>> q = new LinkedList <>();
        List<List<Integer>> res = new ArrayList <>();
        int n = graph.length;
        q.add(Arrays.asList(0));
        
        while (!q.isEmpty()) {
        	List <Integer> cur = q.poll();
        	int lastNode = cur.get(cur.size()-1);
        	
        	if (lastNode == n-1) 
        		res.add(new ArrayList<>(cur));
        	
        	for (int i : graph[lastNode]) {
        		List <Integer> newPath = new ArrayList<>(cur);
        		newPath.add(i);
        		q.add(newPath);
        	}
        }

        return res;
    }
    }
