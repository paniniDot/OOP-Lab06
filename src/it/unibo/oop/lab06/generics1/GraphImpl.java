package it.unibo.oop.lab06.generics1;

import java.util.*;

public class GraphImpl<N> implements Graph<N> {

	private Map<N, Set<N>> graph = new HashMap<>();
	
	@Override
	public void addNode(N node) {
		graph.put(node, new HashSet<N>());
	}

	@Override
	public void addEdge(N source, N target) {
		graph.get(source).add(target);
		graph.get(target).add(source);
	}

	@Override
	public Set<N> nodeSet() {
		return graph.keySet();
	}

	@Override
	public Set<N> linkedNodes(N node) {
		return graph.get(node);
	}

	@Override
	public List<N> getPath(N source, N target) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
