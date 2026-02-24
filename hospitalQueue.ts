class Queue<T> {
    private items: T[] = [];

    // Add patient to the queue
    enqueue(element: T): void {
        this.items.push(element);
        console.log(`Patient added: ${element}`);
    }

    // Attend patient (remove from queue)
    dequeue(): T | undefined {
        if (this.isEmpty()) {
            console.log("No patients in the queue.");
            return undefined;
        }
        const removed = this.items.shift();
        console.log(`Patient attended: ${removed}`);
        return removed;
    }

    // View next patient
    front(): T | undefined {
        return this.items[0];
    }

    // Check if queue is empty
    isEmpty(): boolean {
        return this.items.length === 0;
    }

    // Get queue size
    size(): number {
        return this.items.length;
    }

    // Print queue
    printQueue(): void {
        if (this.isEmpty()) {
            console.log("The queue is empty.");
        } else {
            console.log("Patients waiting:");
            this.items.forEach((patient, index) => {
                console.log(`${index + 1}. ${patient}`);
            });
        }
    }
}

// HOSPITAL SIMULATION (MAIN)

const hospitalQueue = new Queue<string>();

console.log("\n--- Patients arriving ---");

hospitalQueue.enqueue("John");
hospitalQueue.enqueue("Anna");
hospitalQueue.enqueue("Luis");
hospitalQueue.enqueue("Maria");

console.log("\n--- Current queue ---");
hospitalQueue.printQueue();

console.log("\n--- Attending patient ---");
hospitalQueue.dequeue();

console.log("\n--- Next patient ---");
console.log("Next:", hospitalQueue.front());

console.log("\n--- Updated queue ---");
hospitalQueue.printQueue();

console.log("\nTotal patients waiting:", hospitalQueue.size());