  # Sum all the lines added/edited in the PR
  additions: {{ branch.diff.files_metadata | map(attr='additions') | sum }}
  # Sum all the line removed in the PR
  deletions: {{ branch.diff.files_metadata | map(attr='deletions') | sum }}
  # Calculate the ratio of new code
  ratio: {{ (changes.additions / (changes.additions + changes.deletions)) * 100
