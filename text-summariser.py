from transformers import pipeline

def summarize_text(input_text, max_length=150, min_length=50):
    summarizer = pipeline("summarization")
    summary = summarizer(input_text, max_length=max_length, min_length=min_length, length_penalty=2.0, num_beams=4, early_stopping=True)
    return summary[0]['summary_text']

if __name__ == "__main__":
    input_text = input("Enter the text you want to summarize:\n")
    summary = summarize_text(input_text)

    print("\nSummary:")
    print(summary)
