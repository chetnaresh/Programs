from itertools import combinations

def balanced_teams(skills):
    n = len(skills)
    min_diff = float('inf')
    best_teams = ([], [])

    for combo in combinations(skills, n // 2):
        team1 = list(combo)
        team2 = skills.copy()
        for p in team1:
            team2.remove(p)

        diff = abs(sum(team1) - sum(team2))
        if diff < min_diff:
            min_diff = diff
            best_teams = (team1, team2)

    return best_teams

# Example
a, b = balanced_teams([10, 20, 30, 40])
print(f"Team A: {a} | Team B: {b}")
