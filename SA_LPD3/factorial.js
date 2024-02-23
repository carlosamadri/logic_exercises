let number;

while (true) {
    let input = prompt("Enter a number:");
    number = parseInt(input);

    if (!isNaN(number)) {
        break;
    } else {
        alert("Enter a valid number.");
    }
}

function factorial(number) {
    if (number <= 1) {
        return 1;
    } else {
        return number * factorial(number - 1);
    }
}

document.write(number);
document.write("<br>" + factorial(number));