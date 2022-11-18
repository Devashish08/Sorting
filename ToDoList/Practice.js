var count = 1;
function counter(){
    console.log(count);
    count++;
    if(count == 6){
        clearInterval(id);
    }
}
var id = setInterval(counter, 2000);
