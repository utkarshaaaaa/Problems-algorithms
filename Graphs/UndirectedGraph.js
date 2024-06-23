//nre set() have less time com than an array O(1)
const edges = [
  ["i", "j"],
  ["k", "i"],
  ["m", "k"],
  ["k", "l"],
  ["o", "n"],
];

const hasPath = (graph, src, dest, visited) => {
  if (src == dest) {
    return true;
  }
  if (visited.has(src)) {
    return false;
  }
  visited.add(src);
  for (let neighbour of graph[src]) {
    if (hasPath(graph, neighbour, dest, visited) == true) {
      return true;
    }
  }
  return false;
};
//adjency
const graph = (edges) => {
  for (let edge of edges) {
    const [a, b] = edge;
    if (!(a in graph)) {
      graph[a] = [];
    }
    if (!(b in graph)) {
      graph[b] = [];
    }
    graph[b].push(a);
    graph[a].push(b);
  }
  return graph;
};

const arrayGraph = graph(edges);
console.log(hasPath(arrayGraph, "j", "k", new Set()));

