package com.itheima;

public class Graph {
    private final int V;
    private int E;
    private Queue<Integer>[] adj;

    public Graph(int v) {
        this.V = v;
        this.E = 0;
        this.adj = new Queue[v];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();
        }

    }

    public int V() {
        return V;
    }

    public int E() {
        return V;
    }

    public void addEdge(int v, int w) {
        adj[v].enqueue(w);
        adj[w].enqueue(v);
        E++;
    }

    public Queue<Integer> adj(int V) {
        return adj[V];
    }
}
