     ___________________________________
    |                                   |
    |     Bogdan Dumitrescu 322CAa      |
    |           homework #1             |
    |        Object Oriented            |
    |          Programming              |
    |                                   |
    |___________________________________|

• The program aims to implement a game with a board of size 4 x 5, where cards
 named minions can be placed to attack either heroes or other minions.
• Each player has a hero and multiple decks of cards.

• A game can contain multiple other games, and each game has multiple
 rounds.

                  My implementation

• The entry point of the program is the PlayGame class, which is used to initialise each
game. Here we basically create two player objects. Each player has a hero and a specific deck for the current game( which are
contained in the Player class).

• The deck contains either minions or environment cards. The minions will then be placed
on the board.

• Some cards and heroes have special abilities which include freezing another minion. To implement
that, I used a hashmap which stores the position of a card(the key) and the player who owns it(the value).
• A Hashset is used to check if a card attacked the current turn.
• Heroes have a field which stores if it has attacked the current turn.

• Special minions are minions who have abilities, all those minions extrend the abstract SpecialMinion class.
• Heroes are also cards with health(minions are cards with health too), which have special abilities to be implemented.

I created a class for each special minion and hero, which are used to implement the useAbility function.

Winterfell and LordRoyce need access to the hashmap of frozen cards, so they are a special case which 
have to be given a reference to the hashmap through special parametres.

• The game ends when one of the players has no more cards in his deck or when one of the players has no more health.

• The game is played in rounds, each round having a player who starts first. The player who starts first is chosen randomly.  


#### When the game starts, multiple commands can be requested, I used an utility class of static functions to implement de more difficult ones.

The Actions class is used for executing commands.
An ArrayNode is used to add the commands output to.

For the simple commands, I created ObjectNodes with the desired output.</br>
For the more complex ones, I created utility classes which go through different check functions
(to check if the specified command can be applied), if the command can't be applied, the output is
created in the checker command and the program skips it.

utilsOutput utility class is used to create the desired output format each class.

At the end of each turn, the frozen cards are unfrozen and the hero used ability field is set to false.
Also, if a round ends, each user picks a card.

# Disclosures:

I am sorry for the bad code, I had no time, I ran into multiple problems which took a lot of time,
I have multiple projects and homeworks which I'm working on simultaneously and I did not get any kind of help.
I didn't have time for solving coding style errors. </br>
I ran into a lot of problems with git and even now I don't know if I made the commits right, because
I forked the main project and I pushed my code to the master. But apparently that was not what was required, so
I created a new project and I pushed my code there.

### BUT:

I learned a lot from this project, from designing an OOP program to running into problems because of
bad architecture design, adding wrappers to solve the problems and more. </br>
I would love you I could receive an in-depth feedback on my homework and tips for better code architecture.
Also, I would love if I could receive resources for learning more about OOP and design patterns(like books you
liked, online courses, etc). </br>