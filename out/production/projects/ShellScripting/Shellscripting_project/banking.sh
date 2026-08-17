#!/bin/bash
#BankingApp
# Initialize variables
balance=0
transaction_history=""

# Function to display menu
display_menu() {
    echo "---------------------------------"
    echo "       Banking Application"
    echo "---------------------------------"
    echo "1. Deposit Money"
    echo "2. Withdraw Money"
    echo "3. Check Balance"
    echo "4. Transaction History"
    echo "5. Exit"
    echo "---------------------------------"
}

# Function to deposit money
deposit() {
    echo -n "Enter amount to deposit: "
    read amount
    if [[ $amount =~ ^[0-9]+$ ]] && [ $amount -gt 0 ]; then
        balance=$((balance + amount))
        transaction_history+="Deposited: $amount\n"
        echo "Amount deposited successfully!"
    else
        echo "Invalid amount. Please try again."
    fi
}

# Function to withdraw money
withdraw() {
    echo -n "Enter amount to withdraw: "
    read amount
    if [[ $amount =~ ^[0-9]+$ ]] && [ $amount -gt 0 ]; then
        if [ $amount -le $balance ]; then
            balance=$((balance - amount))
            transaction_history+="Withdrew: $amount\n"
            echo "Amount withdrawn successfully!"
        else
            echo "Insufficient balance!"
        fi
    else
        echo "Invalid amount. Please try again."
    fi
}

# Function to check balance
check_balance() {
    echo "Current Balance: $balance"
}

# Function to view transaction history
view_transactions() {
    echo "Transaction History:"
    if [ -z "$transaction_history" ]; then
        echo "No transactions yet."
    else
        echo -e "$transaction_history"
    fi
}

# Main program loop
while true; do
    display_menu
    echo -n "Choose an option: "
    read choice
    case $choice in
        1) deposit ;;
        2) withdraw ;;
        3) check_balance ;;
        4) view_transactions ;;
        5) 
            echo "Thank you for using the Banking App. Goodbye!"
            exit 0
            ;;
        *) echo "Invalid option. Please try again." ;;
    esac
done

