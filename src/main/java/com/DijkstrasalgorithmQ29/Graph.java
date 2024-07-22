package com.DijkstrasalgorithmQ29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {
	
	private int V; // Number of vertices
    private LinkedList<Edge>[] adj;

    public  Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }
  public  void addEdge(int source, int target, int weight) {
      adj[source].add(new Edge(target, weight));  
    
}
  
  public  void dijkstra(int src) {
      // Priority queue to select the vertex with the smallest distance
      PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));

      // Distance array to store the shortest distance from src to each vertex
      int[] dist = new int[V];
      Arrays.fill(dist, Integer.MAX_VALUE);
      dist[src] = 0;

      // Add the source node to the priority queue
      pq.add(new Node(src, 0));

      while (!pq.isEmpty()) {
          Node currentNode = pq.poll();
          int u = currentNode.vertex;

          // Iterate through all the adjacent vertices of u
          for (Edge edge : adj[u]) {
              int v = edge.target;
              int weight = edge.weight;

              // Relaxation step
              if (dist[u] + weight < dist[v]) {
                  dist[v] = dist[u] + weight;
                  pq.add(new Node(v, dist[v]));
              }
          }
      }

      // Print the shortest distances from src to all vertices
      printSolution(dist);
}
  void printSolution(int[] dist) {
      System.out.println("Vertex \t Distance from Source");
      for (int i = 0; i < V; i++) {
          System.out.println(i + " \t\t " + dist[i]);
      }
  }
}