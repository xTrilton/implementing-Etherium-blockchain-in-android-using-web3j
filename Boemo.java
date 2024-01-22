DSFDSFSDF hello test
import random

def main():
  """Prompts user for creative text format and generates content."""

  # Welcome message
  print("Welcome to the Creative Text Generator!")

  # Get user input for format
  format_options = [
      "Haiku",
      "Free verse poem",
      "Code snippet",
      "Movie script scene",
      "Musical piece description",
      "Formal email",
      "Personal letter",
  ]
  print("Please choose a creative text format:")
  for i, option in enumerate(format_options):
    print(f"{i+1}. {option}")
  format_choice = int(input()) - 1

  # Generate content based on chosen format
  content = generate_content(format_options[format_choice])

  # Print generated content
  print(f"\nHere's your {format_options[format_choice]}:")
  print(content)

def generate_content(format_choice):
  """Generates content based on the chosen format."""

  if format_choice == "Haiku":
    # Use syllable counting and nature imagery
    first_line = generate_line(5)
    second_line = generate_line(7)
    third_line = generate_line(5)
    content = f"{first_line}\n{second_line}\n{third_line}"
  elif format_choice == "Free verse poem":
    # Use rhyming and metaphorical language
    lines = []
    for i in range(3, 6):
      lines.append(generate_line(i))
    content = "\n".join(lines)
  elif format_choice == "Code snippet":
    # Generate Python code with random functions and variables
    content = f"def {random_word()}_{random_word()}():\n  {random_code()}"
  elif format_choice == "Movie script scene":
    # Generate dialogue and setting description
    characters = [f"Character {i+1}" for i in range(2)]
    setting = f"{random_place()} on a {random_weather()}"
    content = f"\n**INT. {setting} - DAY**\n\n"
    for character in characters:
      content += f"{character}: {random_dialogue()}\n"
  elif format_choice == "Musical piece description":
    # Generate mood, genre, and instrumentation
    mood = random_adjective() + " and " + random_adjective()
    genre = random_music_genre()
    instruments = ", ".join([random_instrument() for _ in range(2, 4)])
    content = f"A {mood} {genre} piece for {instruments}"
  elif format_choice == "Formal email":
    # Generate subject line, greeting, body, and closing
    subject = f"Regarding {random_noun()}"
    recipient = f"{random_name()}@{random_domain()}"
    body = f"Dear {recipient},\n\nI am writing to you regarding {random_noun()}. {random_sentence()}"
    closing = f"Sincerely,\n{random_name()}"
    content = f"Subject: {subject}\n\nTo: {recipient}\n\n{body}\n\n{closing}"
  elif format_choice == "Personal letter":
    # Generate recipient name, opening salutation, body, and closing
    recipient = f"Dear {random_name()}"
    body = f"I hope this letter finds you well. {random_sentence()} I've been thinking about you lately, and {random_sentence()}"
    closing = f"Warmly,\n{random_name()}"
    content = f"{recipient},\n\n{body}\n\n{closing}"

  return content

# Helper functions for generating random elements
def random_word():
  with open("/usr/share/dict/words", "r") as f:
    words = f.read().splitlines()
  return random.choice(words)

def random_code():
  return f"{random_variable()} = {random_function()}"

def random_function():
  return f"{random_word()}()"

def random_variable():
  return f"{random_word()}_{random_word()}"

def random_line(syllables):
  words = []
  while sum(len(word) for word in words) < syllables:
import random

def main():
  """Prompts user for creative text format and generates content."""

  # Welcome message
  print("Welcome to the Creative Text Generator!")

  # Get user input for format
  format_options = [
      "Haiku",
      "Free verse poem",
      "Code snippet",
      "Movie script scene",
      "Musical piece description",
      "Formal email",
      "Personal letter",
  ]
  print("Please choose a creative text format:")
  for i, option in enumerate(format_options):
    print(f"{i+1}. {option}")
  format_choice = int(input()) - 1

  # Generate content based on chosen format
  content = generate_content(format_options[format_choice])

  # Print generated content
  print(f"\nHere's your {format_options[format_choice]}:")
  print(content)

def generate_content(format_choice):
  """Generates content based on the chosen format."""

  if format_choice == "Haiku":
    # Use syllable counting and nature imagery
    first_line = generate_line(5)
    second_line = generate_line(7)
    third_line = generate_line(5)
    content = f"{first_line}\n{second_line}\n{third_line}"
  elif format_choice == "Free verse poem":
    # Use rhyming and metaphorical language
    lines = []
    for i in range(3, 6):
      lines.append(generate_line(i))
    content = "\n".join(lines)
  elif format_choice == "Code snippet":
    # Generate Python code with random functions and variables
    content = f"def {random_word()}_{random_word()}():\n  {random_code()}"
  elif format_choice == "Movie script scene":
    # Generate dialogue and setting description
    characters = [f"Character {i+1}" for i in range(2)]
    setting = f"{random_place()} on a {random_weather()}"
    content = f"\n**INT. {setting} - DAY**\n\n"
    for character in characters:
      content += f"{character}: {random_dialogue()}\n"
  elif format_choice == "Musical piece description":
    # Generate mood, genre, and instrumentation
    mood = random_adjective() + " and " + random_adjective()
    genre = random_music_genre()
    instruments = ", ".join([random_instrument() for _ in range(2, 4)])
    content = f"A {mood} {genre} piece for {instruments}"
  elif format_choice == "Formal email":
    # Generate subject line, greeting, body, and closing
    subject = f"Regarding {random_noun()}"
    recipient = f"{random_name()}@{random_domain()}"
    body = f"Dear {recipient},\n\nI am writing to you regarding {random_noun()}. {random_sentence()}"
    closing = f"Sincerely,\n{random_name()}"
    content = f"Subject: {subject}\n\nTo: {recipient}\n\n{body}\n\n{closing}"
  elif format_choice == "Personal letter":
    # Generate recipient name, opening salutation, body, and closing
    recipient = f"Dear {random_name()}"
    body = f"I hope this letter finds you well. {random_sentence()} I've been thinking about you lately, and {random_sentence()}"
    closing = f"Warmly,\n{random_name()}"
    content = f"{recipient},\n\n{body}\n\n{closing}"

  return content

# Helper functions for generating random elements
def random_word():
  with open("/usr/share/dict/words", "r") as f:
    words = f.read().splitlines()
  return random.choice(words)

def random_code():
  return f"{random_variable()} = {random_function()}"

def random_function():
  return f"{random_word()}()"

def random_variable():
  return f"{random_word()}_{random_word()}"

def random_line(syllables):
  words = []
  while sum(len(word) for word in words) < syllables:
import random

def main():
  """Prompts user for creative text format and generates content."""

  # Welcome message
  print("Welcome to the Creative Text Generator!")

  # Get user input for format
  format_options = [
      "Haiku",
      "Free verse poem",
      "Code snippet",
      "Movie script scene",
      "Musical piece description",
      "Formal email",
      "Personal letter",
  ]
  print("Please choose a creative text format:")
  for i, option in enumerate(format_options):
    print(f"{i+1}. {option}")
  format_choice = int(input()) - 1

  # Generate content based on chosen format
  content = generate_content(format_options[format_choice])

  # Print generated content
  print(f"\nHere's your {format_options[format_choice]}:")
  print(content)

def generate_content(format_choice):
  """Generates content based on the chosen format."""

  if format_choice == "Haiku":
    # Use syllable counting and nature imagery
    first_line = generate_line(5)
    second_line = generate_line(7)
    third_line = generate_line(5)
    content = f"{first_line}\n{second_line}\n{third_line}"
  elif format_choice == "Free verse poem":
    # Use rhyming and metaphorical language
    lines = []
    for i in range(3, 6):
      lines.append(generate_line(i))
    content = "\n".join(lines)
  elif format_choice == "Code snippet":
    # Generate Python code with random functions and variables
    content = f"def {random_word()}_{random_word()}():\n  {random_code()}"
  elif format_choice == "Movie script scene":
    # Generate dialogue and setting description
    characters = [f"Character {i+1}" for i in range(2)]
    setting = f"{random_place()} on a {random_weather()}"
    content = f"\n**INT. {setting} - DAY**\n\n"
    for character in characters:
      content += f"{character}: {random_dialogue()}\n"
  elif format_choice == "Musical piece description":
    # Generate mood, genre, and instrumentation
    mood = random_adjective() + " and " + random_adjective()
    genre = random_music_genre()
    instruments = ", ".join([random_instrument() for _ in range(2, 4)])
    content = f"A {mood} {genre} piece for {instruments}"
  elif format_choice == "Formal email":
    # Generate subject line, greeting, body, and closing
    subject = f"Regarding {random_noun()}"
    recipient = f"{random_name()}@{random_domain()}"
    body = f"Dear {recipient},\n\nI am writing to you regarding {random_noun()}. {random_sentence()}"
    closing = f"Sincerely,\n{random_name()}"
    content = f"Subject: {subject}\n\nTo: {recipient}\n\n{body}\n\n{closing}"
  elif format_choice == "Personal letter":
    # Generate recipient name, opening salutation, body, and closing
    recipient = f"Dear {random_name()}"
    body = f"I hope this letter finds you well. {random_sentence()} I've been thinking about you lately, and {random_sentence()}"
    closing = f"Warmly,\n{random_name()}"
    content = f"{recipient},\n\n{body}\n\n{closing}"

  return content

# Helper functions for generating random elements
def random_word():
  with open("/usr/share/dict/words", "r") as f:
    words = f.read().splitlines()
  return random.choice(words)

def random_code():
  return f"{random_variable()} = {random_function()}"

def random_function():
  return f"{random_word()}()"

def random_variable():
  return f"{random_word()}_{random_word()}"

def random_line(syllables):
  words = []
  while sum(len(word) for word in words) < syllables:
