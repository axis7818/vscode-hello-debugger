#!/usr/bin/env ts-node

import yargs from 'yargs';

const argv = yargs.alias("n", "name").nargs('n', 1).require('name', "Name Required").argv;

(() => {
   const name = argv.name;
   console.log(`Hello, ${name}`);
})();
