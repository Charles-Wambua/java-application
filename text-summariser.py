import tkinter as tk
from tkinter import scrolledtext
from transformers import pipeline

class SummarizerApp:
    def __init__(self, master):
        self.master = master
        master.title("Text Summarizer")

        self.text_input_label = tk.Label(master, text="Enter the text you want to summarize:")
        self.text_input_label.pack()

        self.text_input = scrolledtext.ScrolledText(master, width=40, height=10, wrap=tk.WORD)
        self.text_input.pack()

        self.summarize_button = tk.Button(master, text="Summarize", command=self.summarize_text)
        self.summarize_button.pack()

        self.output_text = scrolledtext.ScrolledText(master, width=40, height=10, wrap=tk.WORD)
        self.output_text.pack()

    def summarize_text(self):
        input_text = self.text_input.get("1.0", tk.END)
        try:
            summarizer = pipeline("summarization")
            summary = summarizer(input_text, max_length=150, min_length=50, length_penalty=2.0, num_beams=4, early_stopping=True)
            summarized_text = summary[0]['summary_text']
            self.output_text.delete(1.0, tk.END)  # Clear previous output
            self.output_text.insert(tk.END, summarized_text)
        except Exception as e:
            self.output_text.delete(1.0, tk.END)
            self.output_text.insert(tk.END, f"Error: {str(e)}")

if __name__ == "__main__":
    root = tk.Tk()
    app = SummarizerApp(root)
    root.mainloop()
