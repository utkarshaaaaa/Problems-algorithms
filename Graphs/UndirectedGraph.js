const edges = [
    ['i', 'j'],
    ['k', 'i'],
    ['m', 'k'],
    ['k', 'l'],
    ['o', 'n']
  ];
  

  const graph=(edges)=>{

    for(let edge of edges){
        const[a,b]=edge
        if(!(a in graph)){
            graph[a]=[]
        }
        if(!(b in graph)){
            graph[b]=[]
        }
        graph[b].push(a)
        graph[a].push(b)
    }
    return graph

  }
  console.log(graph(edges))
//   undirectedPath(edges, 'j', 'm');