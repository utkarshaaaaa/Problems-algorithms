//to find a path to source node to the destination node and find if there is a pposibility to go 
//we can use dfs or bfs to solve this
const graph={ //Acyclic graph no infinite loops
    a:['b','c'],
    b:['d'],
    c:['e'],
    d:['f'],
    e:[],
    f:[]
}
const city={
    chennai:["banglore"],
    mumbai:["delhi"],
    goa:["chennai"],
    delhi:['goa']
}

const has=(graph,src,dest)=>{ //dfs

    if(src==dest){
        return true
    }
    for(let neighbour of graph[src]){
       if(has(graph,neighbour,dest)==true) {
        return true
       }
    }
    return false

}

console.log(has(city,'goa','mumbai'))
