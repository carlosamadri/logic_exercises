let secretNum = Math.floor((Math.random()* 100) + 1);
let number;

while (true) {
    let input = prompt("Try to guess the secret number, enter a number from 1 to 100:");
    number = parseInt(input);

    if (!isNaN(number)) {
        if (number === secretNum) {
            alert("Congratulations, you guessed the secret number.");
            document.write("Congratulations, the secret number is " + number + "!");
            break;
    } else if (number > secretNum) {
        alert("Ups, the secret number is incorrect, it should be lower. Try again!");
        document.write(number + "<br>");
    } else {
        alert("Ups, the secret number is incorrect, it should be higher. Try again!");
        document.write(number + "<br>");
    }
} else {
    alert("Enter a valid number");
}
}