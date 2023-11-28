/**
 * 
 */
import './stratPageDesign5.css'

const app = document.getElementById('app')
const context = '당신의 여정이 시작되는 순간'
const textArray = context.split('');
const tagName = 'span'
let interval;
let timer = 50;
let index = 0;

const createNode = (tagname) => {
	const tag = document.createElement(tagname)
	return tag;
}

const insertLetters = () => {
	textArray.forEach(letter => {
		const textNode = createNode(tagName)
		if (letter === ' ') {
			textNode.textContent = '\xa0'
		} else {
			textNode.textContent = letter;
		}
		app.appendChild(textNode)
	})
}

const addClass = () => {
	const letters = Array.from(app.querySelectorAll(tagName))
	letters[index].classList.add('text-animated')
	index++
	if (letters.length === index) {
		clearInterval(interval)
	}
}

const loadText = () => {
	insertLetters();
	addClass();

	interval = setInterval(addClass, timer)
}

document.addEventListener('load', loadText())
