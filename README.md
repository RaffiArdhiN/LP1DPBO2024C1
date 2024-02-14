# Human Data Management System

## Overview
This program manages data of members of the Indonesian People's Consultative Assembly (DPR) for the term 2019/2024. It allows users to view, add, edit, and delete member data.

## Prerequisites
- Python 3.x installed

## How to Run
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run the following command in your terminal:
    ```bash
    python HumanManager.py
    ```

## Program Structure

### 1. Human Class (Human.py)
- Represents a member of the DPR.
- Contains attributes: ID, name, field name, party name, and profile photo.
- Provides methods for getting and setting attributes.

### 2. HumanManager Class (HumanManager.py)
- Manages the main program logic.
- Displays a table of DPR members.
- Allows users to add, edit, and delete member data.

### 3. Running the Program (main function in HumanManager.py)
- Initializes a list of Human objects with sample data.
- Displays the initial table of members.
- Prompts the user to choose an option: add, edit, delete, or exit.
- Executes the chosen option and displays the updated table.
- Continues until the user chooses to exit.

## Screenshots

### Initial Table
![Initial Table](screenshots/initial_table.png)

### Adding a Member
![Adding a Member](screenshots/adding_member.png)

### Editing a Member
![Editing a Member](screenshots/editing_member.png)

### Deleting a Member
![Deleting a Member](screenshots/deleting_member.png)

## Conclusion
This program provides a simple interface to manage data of DPR members efficiently.

Feel free to contribute and improve the program!
