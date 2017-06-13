import { Greeter } from './greeter'

let greeter = new Greeter('Play w/ TypeScript, RxJS, and Sass')
let button = document.createElement('button')
button.textContent = 'Say Hello'
button.onclick = () => {
    alert(greeter.greet())
}

document.body.appendChild(button)
