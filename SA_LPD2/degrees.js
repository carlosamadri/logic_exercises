let celsius;

while (true) {
    let input = prompt("Enter the degrees Celsius to be converted:");
    celsius = parseFloat(input);

    if (!isNaN(celsius)) {
        break;
    } else {
        alert("Enter a valid number.");
    }
}

let convertFar = (1.8 * celsius) + 32;
let convertKel = celsius + 273.15;

document.write(celsius + " °C");
document.write("<br>" + convertFar + " °F");
document.write("<br>" + convertKel + " °K");