class Solution {
    public boolean canFinish(int N, int[][] arr) {
        int[] indegree = new int[N];
        List<List<Integer>> adjList = convertEdgesToAdjList(N, arr, indegree);
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> topoSort = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int front = queue.poll();
            topoSort.add(front);
            List<Integer> nodes = adjList.get(front);

            for (int node : nodes) {
                indegree[node]--;
                if (indegree[node] == 0) {
                    queue.add(node);
                }
            }
        }

        return topoSort.size() == N;
    }

    public List<List<Integer>> convertEdgesToAdjList(int N, int[][] arr, int[] indegree) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : arr) {
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
            indegree[v]++;
        }
        return adjList;
    }
}