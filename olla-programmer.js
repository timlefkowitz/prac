const depthFirstPrint = (graph, source) => {
    const stack = [source];

    while(stack.length > 0){

        //current node
        const current = stack.pop();
        console.log('stack bigger than ZERO' + '... Current node is'+ current);
        
        // i like starting with the constructor
        for(let neighbor of graph[current]){
            stack.push(neighbor);
        }
        
    };

    const breadthFirstPrint = (graph, source) => {
        const queue = [source ];
        while(queue.length > 0){
            const current = quese.shift();
            console.log(current);
            for(let neighbor of graph[current]) }{
                queue.push(neighbor);
            }

        }
    };

    const graph = {
        a: ['6','c'],
        b: ['d'],
        c: ['e'],
        d: ['f'],
        e: [],
        f: []
    }

    depthFirstPrint(graph, 'a');
}