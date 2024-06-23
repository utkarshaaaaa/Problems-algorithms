
  
const countedComponent=(graph,src,dest,visited)=>{

    let count=0
    if(visited.has(src)){
        return false;


    }
    visited.add(src)

    for(let neighbour of graph[src]){

       if(countedComponent(graph,neighbour,dest,visited)) {

         return true
       }
       

    }
    return count



}


  

  console.log((arrayGraph, "j", "k", new Set()));