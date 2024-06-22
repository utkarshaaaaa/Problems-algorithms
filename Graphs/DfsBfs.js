const dfs=(graph,source)=>{
    const stack=[source]//uses stack data structure
    
    while(stack.length>0){
        const current=stack.pop()
        console.log(current)
        for(let neighbour of graph[current]){
            stack.push(neighbour)
        }
    }

}

const bfs=(graph ,source)=>{
    const queue=[source]  ///uses  queue
    
    while(queue.length >0){

        const current =queue.shift()//first element in the array 
        console.log(current)

        for(let neighbour of graph[current]){
           queue.push(neighbour)
        }
    }

}

const graph={
    a:['b','c'],
    b:['d'],
    c:['e'],
    d:['f'],
    e:[],
    f:[]
}

// dfs(graph,'a')
bfs(graph,'a')
