#!/usr/bin/env python

from argparse import ArgumentParser
from hello import say_hi


def parse_args():
    parser = ArgumentParser(
        prog="Hello Debugger",
        description="A Simple hello world app to test vscode debugging",
    )
    parser.add_argument("-n", "--name", help="who to say hi to", required=True)
    args = parser.parse_args()
    return args


if __name__ == "__main__":
    args = parse_args()
    say_hi(args.name)  # <------------- put a breakpoint here!
