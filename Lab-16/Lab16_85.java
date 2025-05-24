
import java.util.*;

public class Lab16_85{
    Map<Integer,List<Integer>> adjList;

    public Lab16_85(){
        adjList = new HashMap<>();
    }


public void addEdge(int u, int v){
    adjList.putIfAbsent(u,new ArrayList<>());
    adjList.putIfAbsent(v,new ArrayList<>());
    adjList.get(u).add(v);
    adjList.get(v).add(u);
}

public void dfs(int start){
    Set<Integer> visited = new HashSet<>();
    dfsHelper(start,visited);
}

public void dfsHelper(int vertex,Set<Integer> visited){
    visited.add(vertex);
    System.out.print(vertex + " ");
    for(int neighbor : adjList.getOrDefault(vertex,new ArrayList<>())){
        if(!visited.contains(neighbor)){
            dfsHelper(neighbor,visited);
        }
    }
}

public void bfs(int start){
    Set<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    visited.add(start);

    while(!queue.isEmpty()){
        int vertex = queue.poll();
        System.out.print(vertex+" ");
        for(int neighbor : adjList.getOrDefault(vertex,new ArrayList<>())){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                queue.add(neighbor);
            }
        }
    }
}

public static void main(String[] args) {
    Lab16_85 graph = new Lab16_85();
    graph.addEdge(0,1);
    graph.addEdge(0,2);
    graph.addEdge(1,2);
    graph.addEdge(2,0);
    graph.addEdge(2,3);
    graph.addEdge(3,3);

    System.out.println("DFS traversal : ");
    graph.dfs(2);

    System.out.println("BFS traversal : ");
    graph.bfs(2);
}

}


