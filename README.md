# IronBattle :crossed_swords:

IronBattle is a text-based battle simulator that allows you to create characters and engage in duels between them. The characters can be either warriors or wizards, each with their own unique abilities and attributes.

## Requirements

`` Java 8 or later`` <img height=50 src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg"/>

## Getting started

1. Compile and run the Main class.
Select the type of battle you want to start:

      1: Random battle with random characters.

      2: Custom battle with characters of your choice.

If you selected option 2, you will be prompted to choose the clan and attributes for each character.

The battle will begin and a detailed log of every action will be displayed on the command line.

At the end of the battle, the winner will be announced.

## Classes Features
### Character
The Character class is the superclass for both the Warrior and Wizard classes. It contains the basic attributes of a character such as name, hp, and attack method.

### Warrior
Warriors are strong, well-armored characters that focus on the attribute of strength. Every round a warrior will have a random chance to perform either a Heavy attack or a Weak attack.

- Heavy attack: damage equal to strength and decreases stamina by 5 points. 

- Weak attack: damage equal to half of the strength and increases stamina by 1.

- If a warrior does not have the stamina to perform a Heavy attack, it will perform a Weak attack instead.

- If a warrior does not have the stamina to perform a Weak attack, it will not inflict any damage and increases stamina by 2.

### Wizard

Wizards are the masters of the arcane and their main attribute is intelligence. Every round a wizard will try to randomly cast either a Fireball or a Staff hit.

- Fireball: damage equal to intelligence and decreases mana by 5 points.

- Staff hit: damage equal to 2 and increases mana by 1.

- If a wizard does not have the mana to cast a Fireball, it will perform a Staff hit instead.

- If a wizard does not have the mana to perform a Staff hit, it will not inflict any damage and increases mana by 2.




### Battle
The Battle class is responsible for creating the characters, starting the battle, and displaying the log of the battle. It contains different methods for different type of battle and for different type of characters.


## Authors

This project was created by:
- [@SaraElBadri](https://github.com/SaraElBadri)
- [@elinethmalave](https://github.com/elinethmalave)
- [@manuelsherrera](https://github.com/manuelsherrera)
- [@dinaebh](https://github.com/dinaebh)
- [@jewlys](https://github.com/jewlys)
