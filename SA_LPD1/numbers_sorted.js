let number1 = parseFloat(prompt("Enter the first number:"));
let number2 = parseFloat(prompt("Enter the second number:"));
let number3 = parseFloat(prompt("Enter the third number:"));

if ( number1 === number2 && number2 === number3) {
    console.log("The numbers entered are equal.");
} else {
    let majorToMinor = [number1, number2, number3].sort(function(a, b){return b - a});

    let minorToMajor = [number1, number2, number3].sort(function(a,b){return a - b});

    console.log(majorToMinor);
    console.log(minorToMajor);
}