class Spreadsheet:

    def __init__(self, rows: int):
        self.cells={}

    def setCell(self, cell: str, value: int) -> None:
        self.cells[cell]=value

    def resetCell(self, cell: str) -> None:
        self.cells.pop(cell, None)

    def getValue(self, formula: str) -> int:
        if not formula or not formula.startswith('='):
            return 0
        expr = formula[1:]
        left, right = expr.split('+', 1)
        return self._eval_operand(left.strip()) + self._eval_operand(right.strip())

    def _eval_operand(self, operand: str) -> int:
        operand = operand.strip()
        if operand[0].isdigit():
            return int(operand)
        else:
            return self.cells.get(operand, 0)
