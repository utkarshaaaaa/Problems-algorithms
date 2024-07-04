const countConnected = (graph) => {
  let visited = new Set();
  let count = 0;
  for (let nieghbour of graph) {
    if (explore(graph, nieghbour, visited) == true) {
      count += 1;
    }
  }

  return count;
};

const explore = (graph, neighbour, visited) => {
  if (visited.has(neighbour)) {
    return false;
  }
  visited.add(neighbour);

  for (let next of graph[neighbour]) {
    explore(graph, next, visited);
  }
  return true;
};
const graph = {
  //Acyclic graph no infinite loops
  a: ["b", "c"],
  b: ["d"],
  c: ["e"],
  d: ["f"],
  e: [],
  f: [],
};
console.log(countConnected(graph));
